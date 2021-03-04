package com.example.android.miwok;

/**
 *  represents a vocabulary word that user wants to learn.
 *  It contains a default translation and Miwok translation for that word.
 */
public class Word {
    /** default translation of the word*/
    private String mDefaultTranslation;
    /** Miwok translation of the word*/
    private String mMiwokTranslation;
    /** Image resource ID of the word*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /** Constructor with 2 strings*/
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }
    /** Constructor with 2 strings and 1 integer*/
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }
    /** Get default translation of the word*/
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    /** Get Miwok translation of the word*/
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    /** Get image resource ID of the word*/
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
