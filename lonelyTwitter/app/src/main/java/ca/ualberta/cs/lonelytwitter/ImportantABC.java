package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by bowei2 on 9/14/17.
 */

public class ImportantABC extends ABC{
    public ImportantABC(String info) {
        super(info);
    }

    public ImportantABC(String message, Date date) {
        super(message, date);
    }

    @Override
    protected Boolean isImportant() {
        return Boolean.TRUE;
    }
}
