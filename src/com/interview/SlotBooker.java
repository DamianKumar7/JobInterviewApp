package com.interview;

import java.util.HashMap;

public class SlotBooker {
    int totalCandidates;
    Interviewer interviewers;
    Rooms rooms;
    HashMap<String, Integer> interviewsTakenAtOneTime;

    SlotBooker(int totalCandidates, Interviewer interviewers, Rooms rooms) {
        this.totalCandidates = totalCandidates;
        this.interviewers = interviewers;
        this.rooms = rooms;
        interviewsTakenAtOneTime = new HashMap<>();
        interviewsTakenAtOneTime.put("9-11", 0);
        interviewsTakenAtOneTime.put("11-1", 0);
        interviewsTakenAtOneTime.put("3-5", 0);
    }

    public void bookTimings() throws candidateOverflowException {
        for (int candidateCount = 1; candidateCount <= totalCandidates; candidateCount++) {
            if (!bookfirstSlot(candidateCount) && !booksecondSlot(candidateCount) && !bookthirdSlot(candidateCount)) {
                throw new candidateOverflowException("Entered More Candidates Than Allowed");
            }
        }
    }

    private boolean bookfirstSlot(int candidateCount) {
        if (interviewsTakenAtOneTime.get("9-11") >= 2) {
            return false;
        }
        char interviewerName = interviewers.fetchInterviewerMatchingWithId(candidateCount);
        String roomId = rooms.fetchRoomIdGivenRoomNumber(candidateCount);

        System.out.println(candidateCount + " " + interviewerName + " " + roomId + " 9-11");
        interviewsTakenAtOneTime.put("9-11", interviewsTakenAtOneTime.get("9-11") + 1);
        return true;

    }

    private boolean booksecondSlot(int candidateCount) {
        if (interviewsTakenAtOneTime.get("11-1") >= 2) {
            return false;
        }
        char interviewerName = interviewers.fetchInterviewerMatchingWithId(candidateCount);
        String roomId = rooms.fetchRoomIdGivenRoomNumber(candidateCount);

        System.out.println(candidateCount + " " + String.valueOf(interviewerName) + " " + roomId + " 11-1");
        interviewsTakenAtOneTime.put("11-1", interviewsTakenAtOneTime.get("11-1") + 1);
        return true;

    }

    private boolean bookthirdSlot(int candidateCount) {
        if (interviewsTakenAtOneTime.get("3-5") >= 2) {
            return false;
        }
        char interviewerName = interviewers.fetchInterviewerMatchingWithId(candidateCount);
        String roomId = rooms.fetchRoomIdGivenRoomNumber(candidateCount);

        System.out.println(candidateCount + " " + String.valueOf(interviewerName) + " " + roomId + " 3-5");
        interviewsTakenAtOneTime.put("3-5", interviewsTakenAtOneTime.get("3-5") + 1);
        return true;

    }

}
