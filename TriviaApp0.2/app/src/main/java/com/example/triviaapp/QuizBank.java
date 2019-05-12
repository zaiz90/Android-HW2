package com.example.triviaapp;

public class QuizBank {
    private String[] questions = new String[]{
            "Which of these cars did Jamse Bond not drive in any of the James Bond movies?",
            "1,1,2,3,5,8,13,_,34...  What's the missing number?",
            "What's the oldest continuously inhabited cuty in the world?",
            "1 + 1 = ",
            "2 + 2 = ?",
            "Which one of the four is least like the other three?",
            "Jack is taller than Peter, and Bill is shorter than Jack. Which of the following statements would be more accurate?",
            "The day after the day after tomorrow is four days before Monday. What day is it today?",
            "Forest is to tree as tree is to ?"
    };

    private String[][] choices = new String[][]{
            {"Bentley","Toyota","Acura","Mercury"},
            {"20","21","25","17"},
            {"Istanbul, Turkey","Athens, Greece","Jerusalem, Israel","Damascus, Syria"},
            {"1","2","3","4"},
            {"1","2","3","4"},
            {"Carrot","Potato","Corn","Apple"},
            {"Bill is taller than Peter","Peter is taller than Bill","Bill is as tall as Peter","It is impossible to tell whether Bill or Peter is taller"},
            {"Monday","Tuesday","Wednesday","Thursday"},
            {"Plant","Leaf","Branch","Mangrove"}

    };

    private String[] ansers = new String[]{
            "Acura",
            "21",
            "Damascus, Syria",
            "2",
            "4",
            "Apple",
            "It is impossible to tell whether Bill or Peter is taller",
            "Monday",
            "Leaf"
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

    public int getNumOfQuestions()
    {
        int n = questions.length;
        return n;
    }
}