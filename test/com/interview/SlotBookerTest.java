package com.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SlotBookerTest {

    @Test
    void shouldGiveBookingsWhenFedWithValidCandidateCount() throws candidateOverflowException {
        Rooms newRooms = new Rooms(2);
        Interviewer newInterviewers = new Interviewer(3);
        SlotBooker bookNewSlots = new SlotBooker(5,newInterviewers,newRooms);
        bookNewSlots.bookTimings();
    }
}