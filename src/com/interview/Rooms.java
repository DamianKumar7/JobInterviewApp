package com.interview;

import java.util.HashMap;

public class Rooms {
    HashMap<Integer, String> mapForRoomNames;
    int numberOfRooms;
    Rooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
        mapForRoomNames = new HashMap<>();
        for(int roomNumber = 1;roomNumber<=numberOfRooms;roomNumber++){
            mapForRoomNames.put(roomNumber,"R"+ roomNumber);
        }
//        System.out.println(mapForRoomNames);
    }

    public String fetchRoomIdGivenRoomNumber(int candidateCount) {
        int roomNumber = candidateCount %numberOfRooms == 0 ? candidateCount : candidateCount % numberOfRooms;
        if (roomNumber == candidateCount && roomNumber > numberOfRooms) {
            roomNumber = roomNumber / numberOfRooms;
        }
        return mapForRoomNames.get(roomNumber);
    }
}
