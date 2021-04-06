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
    /** Sound resource ID of the word*/
    private int mSoundResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    /** Constructor with 2 strings and 1 integer*/
    public Word(String defaultTranslation, String miwokTranslation, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourceId = soundResourceId;
    }
    /** Constructor with 2 strings and 2 integer*/
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mSoundResourceId = soundResourceId;
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
    /** Get sound resource ID of the word*/
    public int getSoundResourceId() {
        return mSoundResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Returns the string representation of the {@link Word} object.
     */
    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mSoundResourceId=" + mSoundResourceId +
                '}';
    }
}
