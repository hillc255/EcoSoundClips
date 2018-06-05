package com.example.android.ecosoundclips;

import android.media.MediaPlayer;

/**
     * {@Link Sound represents a list of mp3 environmental sound clips
     * It contains title, length, size of sound clip - Class Declaration
     */
    public class Sound {

    /** Title of sound clip */
        private String mTitleSoundClip;

        /** Length of the sound clip - State */
        private String mLengthSoundClip;

        /** Size of the sound clip - State */
        private String mSizeSoundClip;


        /** Constructor - create new sound object
         * Setters not needed because the sound object will not change
         * @param vTitleSoundClip is the sound title
         * @param vLengthSoundClip is the sound length
         * @param vSizeSoundClip is the sound size
         * */
        public Sound(String vTitleSoundClip, String vLengthSoundClip, String vSizeSoundClip){
            mTitleSoundClip = vTitleSoundClip;
            mLengthSoundClip = vLengthSoundClip;
            mSizeSoundClip = vSizeSoundClip;
        }

        /**
         * Get the title of the sound clip- Getter Method
         * @return String
         */
        public String getTitleSoundClip(){
            return mTitleSoundClip;
        }

        /**
         * Get length of the sound clip - Getter Method
         * @return String
         */
        public String getLengthSoundClip(){
            return mLengthSoundClip;
        }

        /**
         * Get size of the sound clip - Getter Method
         * @return String
         */
        public String getSizeSoundClip(){
            return mSizeSoundClip;
        }

    }

