package com.saswati.miwok_language_app;

public class ReportCard {

  //Variables
    private String rMathGrade;
    private String rEnglishGrade;
    private String rHistoryGrade;
    private String rGeographyGrade;


    //Constructors
    public ReportCard(String mathGrade,String englisgGrade,String historyGrade,String geographyGrade)
    {
        rMathGrade=mathGrade;
        rEnglishGrade=englisgGrade;
        rHistoryGrade=historyGrade;
        rGeographyGrade=geographyGrade;
    }

    //Methods:-

    public String getrMathGrade()
    {
        return rMathGrade;
    }
    public String getrEnglishGrade()
    {
        return rEnglishGrade;
    }
    public String getrHistoryGrade()
    {
        return rHistoryGrade;
    }
    public String getrGeographyGrade()
    {
        return rGeographyGrade;
    }
}
