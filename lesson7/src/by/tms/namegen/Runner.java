package by.tms.namegen;

import by.tms.namegen.repository.CreatedNamesRepository;
import by.tms.namegen.repository.NamesPartRepository;
import by.tms.namegen.service.NamesPartService;

public class Runner {
    public static void main(String[] args) {
        NamesPartRepository npr = new NamesPartRepository();
        CreatedNamesRepository cnr = new CreatedNamesRepository();

        NamesPartService nps = new NamesPartService(npr, cnr);

        for (int i = 0; i < cnr.completedNames.length; i++) {
            String fullName = nps.generateRandomName();
            cnr.add(fullName);
        }


        for (String cn : cnr.completedNames) {
            System.out.println(cn);
        }
    }
}
