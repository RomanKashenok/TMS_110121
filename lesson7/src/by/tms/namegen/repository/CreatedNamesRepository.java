package by.tms.namegen.repository;

public class CreatedNamesRepository {

    public String [] completedNames = new String[100];

    public void add(String genName) {
        for (int i = 0; i < completedNames.length; i++) {
            if(completedNames[i] == null) {
                completedNames[i] = genName;
                return;
            }
        }
    }
}
