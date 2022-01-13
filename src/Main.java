import br.com.dio.challenge.domain.*;

import java.time.LocalDate;

public
class Main {
    public static
    void main (String[] args) {
        Course js = new Course();
        js.setTitle("JS");
        js.setDescription("It's all you need to get started with");
        js.setTrainingHours(20);

        Course littleJava = new Course();
        littleJava.setTitle("Java");
        littleJava.setDescription("It's all you need to get started with");
        littleJava.setTrainingHours(500);

        Mentoring jhonny = new Mentoring();
        jhonny.setTitle("Jhonny in action with JS");
        jhonny.setDescription("Js step-by-step");
        jhonny.setData(LocalDate.now());

        Bootcamp javaDeveloper = new Bootcamp();
        javaDeveloper.setName("Java Developer");
        javaDeveloper.setDescription("From the ground up to Advanced");
        javaDeveloper.getContents().add(js);
        javaDeveloper.getContents().add(littleJava);
        javaDeveloper.getContents().add(jhonny);

        Dev devMarcelo = new Dev();
        devMarcelo.setNome("Marcelo");
        devMarcelo.bootcampSubscribed(javaDeveloper);
        devMarcelo.progress();
        System.out.println(devMarcelo.getNome());
        System.out.println("Subscribed Content: " + devMarcelo.getSubscribedContents());
        System.out.println("Finished Content: " + devMarcelo.getFinishedContents());
        System.out.println("-------------------\n");
        Dev devCami = new Dev();
        devCami.setNome("Cami-mi");
        devCami.bootcampSubscribed(javaDeveloper);
        devCami.progress();
        devCami.progress();
        devCami.progress();
        System.out.println(devCami.getNome());
        System.out.println("Subscribed Content: " + devCami.getSubscribedContents());
        System.out.println("Finished Content: " + devCami.getFinishedContents());
        System.out.println("-------------------\n");



    }

}
