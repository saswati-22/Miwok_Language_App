package com.saswati.miwok_language_app;

public class Word {

    //States
    //To set the default translation
    private String mDefaultTranslation;
    //To set the miwok translation
    private String mMiwokTranslation;

    //To get the ID of image resources
    private int mImageResourcesID=NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED=0;




    //constructors

    public Word(String defaultTranslation,String miwokTranslation)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
    }
    public Word(String defaultTranslation,String miwokTranslation,int imageResourceID)
    {
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTranslation;
        mImageResourcesID=imageResourceID;



    }

    //Methods
    public String getmDefaultTranslation()
    {
        return mDefaultTranslation;
    }
    public String getmMiwokTranslation()
    {
        return mMiwokTranslation;
    }

    public int getImageResourcesID()
    {
        return mImageResourcesID;
    }


    public boolean hasImage()
    {
        return mImageResourcesID!=NO_IMAGE_PROVIDED;
    }
}

