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
            interviewer++;
        }
    }

    public char fetchInterviewerMatchingWithId(int candidateCount) {
        int interviewernumber = candidateCount % numberOfInterviewers == 0 ? candidateCount : candidateCount %numberOfInterviewers;
        if (interviewernumber == candidateCount && interviewernumber > numberOfInterviewers) {
            interviewernumber = interviewernumber / numberOfInterviewers;
        }
        return mapForInterviewerNumberToName.get(interviewernumber);
    }
}
