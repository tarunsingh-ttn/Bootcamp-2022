// Demonstrate the use AutoCloseable
class Resource implements AutoCloseable{
    public Resource() {
        System.out.println("Resource created");
    }

    public void display() {
        System.out.println("Resource displayed");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Resource close method invoked");
    }
}


class Resource2 implements AutoCloseable{
    public Resource2() {
        System.out.println("Resource2 created");
    }

    public void display() {
        System.out.println("Resource2 displayed");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Resource2 close method invoked");
    }
}

public class Question8 {
    public static void main(String[] args) {
        Resource resource = new Resource();
        Resource2 resource2 = new Resource2();
        try(resource;resource2){
            resource.display();
            resource2.display();
        }catch (Exception ex){

        }
    }
    }

