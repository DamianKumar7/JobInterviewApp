package com.interview;

import java.util.HashMap;
import java.util.List;

public class Rooms {
    HashMap<Integer, String> mapForRoomNames;
    int numberOfRooms;
    Rooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
        mapForRoomNames = new HashMap<Integer, String>();
        for(int roomNumber = 1;roomNumber<=numberOfRooms;roomNumber++){
            mapForRoomNames.put(roomNumber,"R"+String.valueOf(roomNumber));
        }
    }

}
