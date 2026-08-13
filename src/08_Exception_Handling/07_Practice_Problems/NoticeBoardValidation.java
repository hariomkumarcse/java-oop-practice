import java.time.LocalDate;

class EmptyTitleException extends Exception {

    EmptyTitleException(String message) {
        super(message);
    }
}

class EmptyDescriptionException extends Exception {

    EmptyDescriptionException(String message) {
        super(message);
    }
}

class PastDateException extends Exception {

    PastDateException(String message) {
        super(message);
    }
}

class Notice {

    private String title;
    private String description;
    private LocalDate eventDate;

    Notice(String title, String description, LocalDate eventDate) {

        this.title = title;
        this.description = description;
        this.eventDate = eventDate;
    }

    void validateNotice()
            throws EmptyTitleException,
                   EmptyDescriptionException,
                   PastDateException {

        if (title == null || title.trim().isEmpty()) {

            throw new EmptyTitleException(
                    "Notice title cannot be empty."
            );
        }

        if (description == null || description.trim().isEmpty()) {

            throw new EmptyDescriptionException(
                    "Notice description cannot be empty."
            );
        }

        if (eventDate == null) {

            throw new PastDateException(
                    "Event date cannot be null."
            );
        }

        if (eventDate.isBefore(LocalDate.now())) {

            throw new PastDateException(
                    "Event date cannot be in the past."
            );
        }

        System.out.println("Notice validation successful.");
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);
        System.out.println("Event Date: " + eventDate);
    }
}

public class NoticeBoardValidation {

    public static void main(String[] args) {

        Notice notice = new Notice(
                "Java Training Test",
                "Java training test will be conducted.",
                LocalDate.of(2026, 8, 20)
        );

        try {

            notice.validateNotice();

        } catch (EmptyTitleException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (EmptyDescriptionException e) {

            System.out.println("Error: " + e.getMessage());

        } catch (PastDateException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}