interface HttpService {
    void handleHttpRequest();
}


interface DatabaseManager {
    void executeSqlStatement();
}


interface ContainerOps {
    void restartDockerContainer();
}


class WebController implements HttpService {
    public void handleHttpRequest() {

        System.out.println("Routing traffic to endpoint.");
    }
}


class DatabaseService implements DatabaseManager {

    public void executeSqlStatement() {
        System.out.println("Executing SQL query.");
    }
}

class DockerManager implements ContainerOps {

    public void restartDockerContainer() {
        System.out.println("Restarting Docker container.");
    }
}


public class Main6 {
    public static void main(String[] args) {

        WebController c1 =new WebController();

        c1.handleHttpRequest();


        DatabaseService database = new DatabaseService();

        database.executeSqlStatement();

        DockerManager docker = new DockerManager();

        docker.restartDockerContainer();
    }
}
