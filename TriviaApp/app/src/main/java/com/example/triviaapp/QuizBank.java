package com.example.triviaapp;

public class QuizBank {
    public static String[] questions = new String[]{
            "Which of these cars did Jamse Bond not drive in any of the James Bond movies?",
            "1,1,2,3,5,8,13,_,34...  What's the missing number?",
            "What's the oldest continuously inhabited cuty in the world?",
            "James’s mom has four children. Their names are April, May, June, and ____?",
            "question 5",
            "question 6",
            "question 7",
            "question 8",
            "question 9",
            "question 10",
    };

    public static String[][] choices = new String[][]{
            {"Bentley","Toyota","Acura","Mercury"},
            {"20","21","25","17"},
            {"Istanbul, Turkey","Athens, Greece","Jerusalem, Israel","Damascus, Syria"},
            {"July","August","James","January"},
            {"1","2","3","4"},
            {"1","2","3","4"},
            {"1","2","3","4"},
            {"1","2","3","4"},
            {"1","2","3","4"},
            {"1","2","3","4"},
    };

    public static String[] ansers = new String[]{
            "Acura",
            "21",
            "Damascus, Syria",
            "James",
            "answer 5",
            "answer 6",
            "answer 7",
            "answer 8",
            "answer 9",
            "answer 10",
    };

    public String getQuestion(int n)
    {
        String question = questions[n];
        return question;
    }

    public String getChoice1(int n)
    {
        String choice = choices[n][0];
        return choice;
    }

    public String getChoice2(int n)
    {
        String choice = choices[n][1];
        return choice;
    }

    public String getChoice3(int n)
    {
        String choice = choices[n][2];
        return choice;
    }

    public String getChoice4(int n)
    {
        String choice = choices[n][3];
        return choice;
    }

    public String getAnswer(int n)
    {
        String answer = ansers[n];
        return answer;
    }
}