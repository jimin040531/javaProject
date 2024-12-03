/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.hms.checkin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jimin
 */
class hotelReservationManager {
    private final List<hotelFloor> floors; // 각 층의 리스트를 저장하는 변수
    private static final String FILE_NAME = "roomReservations.txt"; // 예약 정보를 저장하는 파일 이름

    // 생성자: 층과 층당 객실 수를 받아 초기화
    public hotelReservationManager(int numFloors, int roomsPerFloor) {
        floors = new ArrayList<>();
        for (int i = 0; i < numFloors; i++) {
            floors.add(new hotelFloor(roomsPerFloor)); // 각 층에 방 추가
        }
        loadReservations(); // 프로그램 시작 시 예약 정보 로드
    }

    // 특정 층의 특정 방이 예약 가능한지 여부를 확인
    public boolean isRoomAvailable(int floor, int room, LocalDate checkIn, LocalDate checkOut) {
        return floors.get(floor).isRoomAvailable(room, checkIn, checkOut);
    }

    // 특정 층의 특정 방을 예약
    public boolean reserveRoom(int floor, int room, LocalDate checkIn, LocalDate checkOut) {
        boolean success = floors.get(floor).reserveRoom(room, checkIn, checkOut);
        if (success) saveReservations(); // 예약 성공 시 예약 정보 저장
        return success;
    }

    // 특정 층의 특정 방을 체크아웃 처리
    public boolean checkoutRoom(int floor, int room, LocalDate checkIn, LocalDate checkOut) {
        floors.get(floor).getRoom(room).checkout(checkIn, checkOut); // 방의 체크아웃 처리
        saveReservations(); // 체크아웃 후 예약 정보 저장
        return true;
    }

    // 층 정보를 반환하는 메서드 추가
    public hotelFloor getFloor(int floorIndex) {
        if (floorIndex >= 0 && floorIndex < floors.size()) {
            return floors.get(floorIndex);
        } else {
            System.out.println("Invalid floor index: " + floorIndex);
            return null;
        }
    }

    // 층 리스트를 반환하는 메서드 추가
    public List<hotelFloor> getFloors() {
        return floors;
    }

    // 파일로 예약 정보 저장
    public void saveReservations() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(floors); // 모든 층의 예약 정보 저장
            System.out.println("Reservation information saved to file.");
        } catch (Exception e) {
            e.printStackTrace(); // 오류 발생 시 오류 출력
        }
    }

    // 파일에서 예약 정보 로드
    @SuppressWarnings("unchecked")
    public final void loadReservations() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            List<hotelFloor> loadedFloors = (List<hotelFloor>) in.readObject(); // 파일에서 읽어온 예약 정보 로드
            for (int i = 0; i < floors.size(); i++) {
                floors.set(i, loadedFloors.get(i)); // 기존 층 정보 업데이트
            }
            System.out.println("Reservation information loaded from file.");
        } catch (Exception e) {
            System.out.println("No previous reservations found. Starting fresh."); // 이전 예약 정보가 없을 경우 출력
        }
    }

    // 층과 방 정보를 설정하는 메서드 추가
    public void setRoomInfo(int floor, int room, int price, String grade, int capacity) {
        if (floor >= 0 && floor < floors.size()) {
            hotelFloor currentFloor = floors.get(floor);
            if (room >= 0 && room < currentFloor.getRooms().size()) {
                currentFloor.setRoomInfo(room, price, grade, capacity);
                System.out.println("Set room info for floor " + (floor + 1) + ", room " + (room + 1) + ": Price=" + price + ", Grade=" + grade + ", Capacity=" + capacity);
            } else {
                System.out.println("Invalid room index: " + room);
            }
        } else {
            System.out.println("Invalid floor index: " + floor);
        }
    }
}