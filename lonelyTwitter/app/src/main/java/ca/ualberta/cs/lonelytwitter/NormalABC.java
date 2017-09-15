package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bowei2 on 9/14/17.
 */

public class NormalABC extends ABC {
    public NormalABC(String message) {
        super(message);
    }

    public NormalABC(String message, Date date) {
        super(message, date);
    }

    @Override
    protected Boolean isImportant() {
        return Boolean.FALSE;
    }
}

