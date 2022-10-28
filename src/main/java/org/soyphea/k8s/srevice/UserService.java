package org.soyphea.k8s.srevice;

import org.soyphea.k8s.domain.User;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;


@Service
public class UserService {

    List<User> users = Arrays.asList(new User(1, "Dara"), new User(2, "Seyha"));

    public List<User> getUser(String containName) {

        return users.stream().filter(user -> user.getName().contains(containName)).collect(Collectors.toList());
    }
    public void test(HttpServletRequest request) throws IOException {
        String folder = request.getParameter("folder");
        String cmd = "mkdir " + folder;
        Runtime.getRuntime().exec(cmd); // Noncompliant
    }


}

