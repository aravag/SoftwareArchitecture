package task1012;

import static org.junit.jupiter.api.Assertions.*;

class AccessRepoTest {

    @org.junit.jupiter.api.Test
    void getUser() {
        User user = new User("PersonName");
        AccessRepo accessRepoTest = new AccessRepo(user, new Group("Software Architecture"));
        assertEquals(user, accessRepoTest.getUser());
    }

    @org.junit.jupiter.api.Test
    void setUser() {
        AccessRepo accessRepoTest = new AccessRepo(new User("PersonName"), new Group("Software Architecture"));
        User user2 = new User("Иванов PersonName");
        accessRepoTest.setUser(user2);
        assertEquals(user2, accessRepoTest.getUser());
    }

    @org.junit.jupiter.api.Test
    void getGroup() {
        Group group = new Group("Software Architecture");
        AccessRepo accessRepoTest = new AccessRepo(new User("PersonName"), group);
        assertEquals(group, accessRepoTest.getGroup());

    }

    @org.junit.jupiter.api.Test
    void setGroup() {
        AccessRepo accessRepoTest = new AccessRepo(new User("PersonName"), new Group("Software Architecture"));
        Group group2 = new Group("Архитерктура");
        accessRepoTest.setGroup(group2);
        assertEquals(group2, accessRepoTest.getGroup());
    }
}