package com.example.group8.dindrikkelek;

import android.provider.BaseColumns;

public class bildeBaseColumns {

    //An empty private constructor makes sure that the class is not going to be initialised.
    private bildeBaseColumns() {

    }

    public static final class bildeEntry implements BaseColumns {
        public static final String TABLE_NAME = "BILDE";
        public static final String COLUMN_FILNAVN = "FILNAVN";
        public static final String COLUMN_BILDEBESKRIVELSE = "BILDEBESKRIVELSE";
    }

}
