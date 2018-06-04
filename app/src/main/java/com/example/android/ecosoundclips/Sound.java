package com.example.android.ecosoundclips;

    /**
     * {@Link Word represents a vocabulary word that the user wants to learn.
     * It contains a default translation and a Miwork translation for that word} - Class Declaration
     */
    public class Sound {

        /** Title of sound clip */
        private String mTitleSoundClip;

        /** Length of the sound clip - State */
        private String mLengthSoundClip;

        /** Size of the sound clip - State */
        private String mSizeSoundClip;

        /** Source of the sound clip - State */
        private String mSourceSoundClip;


        /** Constructor - create new sound object
         * Setters not needed because the sound object will not change
         * @param vTitleSoundClip is the sound title
         * @param vLengthSoundClip is the sound length
         * @param vSizeSoundClip is the sound size
         * @param vSourceSoundClip is the sound source
         * */
        public Sound(String vTitleSoundClip, String vLengthSoundClip, String vSizeSoundClip,
                     String vSourceSoundClip){
            mTitleSoundClip = vTitleSoundClip;
            mLengthSoundClip = vLengthSoundClip;
            mSizeSoundClip = vSourceSoundClip;
            mSourceSoundClip = vSourceSoundClip;
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


        /**
         * Get source of the sound clip - Getter Method
         * @return String
         */
        public String getSourceSoundClip(){
            return mSourceSoundClip;
        }


    }

