/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.hms.reservation;

import java.util.UUID; // UUID를 사용하기 위해 추가

/**
 *
 * @author adsd3
 */

public class ReservationData {
    private String uniqueNumber; // String 타입으로 변경
    private String name;
    private String address;
    private String phoneNumber;
    private String checkInDate;
    private String checkOutDate;
    private String roomNumber;
    private String guestCount;
    private String stayCost;
    private String paymentMethod;
    private String roomSelection;
    private String cardStatus;
public ReservationData(String name, String address, String phoneNumber,
                       String checkInDate, String checkOutDate, String roomNumber,
                       String guestCount, String stayCost, String paymentMethod,
                       String roomSelection, String cardStatus) {
    this.uniqueNumber = UUID.randomUUID().toString(); // 고유번호 생성
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.checkInDate = checkInDate;
    this.checkOutDate = checkOutDate;
    this.roomNumber = roomNumber;
    this.guestCount = guestCount;
    this.stayCost = stayCost;
    this.paymentMethod = paymentMethod;
    this.roomSelection = roomSelection;
    this.cardStatus = cardStatus;
}

// 기존 데이터 로드용 생성자
public ReservationData(String uniqueNumber, String name, String address, String phoneNumber,
                       String checkInDate, String checkOutDate, String roomNumber,
                       String guestCount, String stayCost, String paymentMethod,
                       String roomSelection, String cardStatus) {
    this.uniqueNumber = uniqueNumber; // 기존 고유번호 유지
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.checkInDate = checkInDate;
    this.checkOutDate = checkOutDate;
    this.roomNumber = roomNumber;
    this.guestCount = guestCount;
    this.stayCost = stayCost;
    this.paymentMethod = paymentMethod;
    this.roomSelection = roomSelection;
    this.cardStatus = cardStatus;
}

// txt파일 수정할 때 사용하는 코드 데이터를 csv형태로 변환
    public String toCSV() {
    return uniqueNumber + "," +
           name + "," +
           address + "," +
           phoneNumber + "," +
           checkInDate + "," +
           checkOutDate + "," +
           roomNumber + "," +
           guestCount + "," +
           stayCost + "," +
           paymentMethod + "," +
           roomSelection + "," +
           cardStatus;
}

    // Getters and setters (필수)
    public String getUniqueNumber() {
        return uniqueNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getGuestCount() {
        return guestCount;
    }

    public String getStayCost() {
        return stayCost;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getRoomSelection() {
        return roomSelection;
    }

    public String getCardStatus() {
        return cardStatus;
    }
    public void setUniqueNumber(String uniqueNumber) { //고유번호 setter
        this.uniqueNumber = uniqueNumber;
    }
}
