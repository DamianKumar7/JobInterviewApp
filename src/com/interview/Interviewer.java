package com.interview;

import java.util.HashMap;

public class Interviewer {
    int numberOfInterviewers;
    HashMap<Integer,Character>mapForInterviewerNumberToName;
    Interviewer(int numberOfInterviewers){
        char interviewer = 'A';
        mapForInterviewerNumberToName = new HashMap<Integer,Character>();
        this.numberOfInterviewers = numberOfInterviewers;
        for(int interviewerNo = 1;interviewerNo<= numberOfInterviewers;interviewerNo++){
            mapForInterviewerNumberToName.put(interviewerNo,interviewer);
        }
    }
}
