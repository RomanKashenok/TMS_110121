package by.tms.namegen.service;

import by.tms.namegen.repository.CreatedNamesRepository;
import by.tms.namegen.repository.NamesPartRepository;

import java.util.Random;

public class NamesPartService {

    public NamesPartRepository npr;
    public CreatedNamesRepository cnr;

    public NamesPartService(NamesPartRepository npr,
                            CreatedNamesRepository cnr) {
        this.npr = npr;
        this.cnr = cnr;
    }

    public String generateRandomName() {
        int fNameLength = npr.firstNames.length;
        int lNameLength = npr.lastName.length;

        Random rand = new Random();
        int fNameRandIndex = rand.nextInt(fNameLength);
        int lNameRandIndex = rand.nextInt(lNameLength);

        return npr.firstNames[fNameRandIndex] + " " + npr.lastName[lNameRandIndex];
    }

}
