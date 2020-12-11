package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public abstract class FakeApiServiceGenerator {
    public static List<User> generateUsers() {
        return new ArrayList<>(FAKE_USERS);
    }

    public static List<User> nonAfficheUsers() { return new ArrayList<>(FAKE_USERS_RANDOM); }

    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "Jake", "data:image/jpeg;base64,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"),
            new User("002", "Paul", "http://clipart-library.com/data_images/163977.jpg"),
            new User("003", "Phil", "http://clipart-library.com/newhp/kAibeA8c4.png"),
            new User("004", "Guillaume", "http://clipart-library.com/data_images/163960.png"),
            new User("005", "Francis", "http://clipart-library.com/data_images/163956.jpg"),
            new User("006", "George", "http://clipart-library.com/data_images/163966.jpg"),
            new User("007", "Louis", "http://clipart-library.com/data_images/163932.jpg"),
            new User("008", "Mateo", "http://clipart-library.com/data_images/163926.jpg"),
            new User("009", "April", "http://clipart-library.com/data_images/163935.jpg"),
            new User("010", "Louise", "http://clipart-library.com/data_images/163948.png"),
            new User("011", "Elodie", "http://clipart-library.com/data_images/163932.jpg"),
            new User("012", "Helene", "http://clipart-library.com/data_images/79663.png"),
            new User("013", "Fanny", "http://clipart-library.com/data_images/163914.jpg"),
            new User("014", "Laura", "http://clipart-library.com/data_images/19601.png"),
            new User("015", "Gertrude", "http://clipart-library.com/data_images/163892.jpg"),
            new User("016", "Chloé", "http://clipart-library.com/data_images/163914.jpg"),
            new User("017", "April", "http://clipart-library.com/images/ziXp7E7iB.png"),
            new User("018", "Marie", "http://clipart-library.com/new_gallery/1-15826_free-gold-christmas-ornaments-png-png-download.png"),
            new User("019", "Henri", "https://thumbs.dreamstime.com/b/funny-christmas-reindeer-cartoon-holding-wooden-pa-22253100.jpg"),
            new User("020", "Rémi", "https://thumbs.dreamstime.com/b/dachshund-christmas-santa-cute-cartoon-character-vector-illustration-happy-dog-wearing-claus-beanie-ready-celebrate-156337318.jpg")
    );

    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://thumbs.dreamstime.com/b/santa-black-skull-creepy-claus-red-beanie-dark-christmas-lovers-63387295.jpg"),
            new User("022", "Geoffrey", "https://thumbs.dreamstime.com/b/santa-black-skull-creepy-claus-red-beanie-dark-christmas-lovers-63387295.jpg"),
            new User("023", "Simon", "https://thumbs.dreamstime.com/b/santa-reindeer-christmas-illustration-cartoon-peeking-above-sign-pointing-waving-58413400.jpg"),
            new User("024", "André", "https://thumbs.dreamstime.com/b/orange-kitten-lie-bed-little-36682352.jpg"),
            new User("025", "Leopold", "https://thumbs.dreamstime.com/b/snowman-beak-bird-snow-102708290.jpg")
    );
}
