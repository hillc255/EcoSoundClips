package com.example.android.ecosoundclips;

import android.media.MediaPlayer;

    /**
     * {@Link Sound represents a list of mp3 environmental sound clips
     * It contains title, length, size of sound clip and sound clip - Class Declaration
     */
    public class Sound {

    /** Title of sound clip */
        private String mTitleSoundClip;

        /** Length of the sound clip - State */
        private String mLengthSoundClip;

        /** Size of the sound clip - State */
        private String mSizeSoundClip;

        /** Name of mp3 sound clip - State */
        private String mSoundClip;

    /** Constructor - create new sound object
         * Setters not needed because the sound object will not change
         * @param vTitleSoundClip is the sound title
         * @param vLengthSoundClip is the sound length
         * @param vSizeSoundClip is the sound size
         * @param vSoundClip is the mp3 sound clip
         * */
        public Sound(String vTitleSoundClip, String vLengthSoundClip, String vSizeSoundClip, String vSoundClip){
            mTitleSoundClip = vTitleSoundClip;
            mLengthSoundClip = vLengthSoundClip;
            mSizeSoundClip = vSizeSoundClip;
            mSoundClip = vSoundClip;
        }

        /**
         * Get the title of the sound clip- Getter Method
         * @return String
         */
        public String getTitleSoundClip(){
            return "Title: " + mTitleSoundClip;
        }

        /**
         * Get length of the sound clip - Getter Method
         * @return String
         */
        public String getLengthSoundClip(){ return "Length: " + mLengthSoundClip;
        }

        /**
         * Get size of the sound clip - Getter Method
         * @return String
         */
        public String getSizeSoundClip(){
            return "Size: " + mSizeSoundClip;
        }

        /**
        * Get mp3 sound clip - Getter Method
         * @return String
         */
         public String getSoundClip(){ return mSoundClip;
    }

    }

