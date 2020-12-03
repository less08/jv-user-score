package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {
    private static final int EMAIL_INDEX = 0;
    private static final int RECORD_INDEX = 1;
    private static final String DIVIDER = ":";

    public int getUserScore(String[] records, String email) {
        for (String record : records) {
            String[] recordRow = record.split(DIVIDER);
            if (recordRow[EMAIL_INDEX].equals(email)) {
                return Integer.parseInt(recordRow[RECORD_INDEX]);
            }
        }

        throw new UserNotFoundException("User with given email doesn't exist");
    }

}
