package interfaces.impls;
/**
 * -- Created by Michael Verlamov -- *
 * -- Contact mail: verlamov.m@gmail.com -- *
 * -- My GitHub: https://github.com/VMAproject -- *
 */
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import interfaces.AddressBook;
import objects.Person;

// класс реализовывает интерфейс с помощью коллекции
public class CollectionAddressBook implements AddressBook {

    private ObservableList<Person> personList = FXCollections.observableArrayList();

    @Override
    public void add(Person person) {
        personList.add(person);
    }

    @Override
    // для коллекции не используется, но пригодится для случая, когда данные хранятся в БД и пр.
    public void update(Person person) {
        // т.к. коллекция и является хранилищем - то ничего обновлять не нужно
        // если бы данные хранились в БД или файле - в этом методе нужно было бы обновить соотв. запись
    }

    @Override
    public void delete(Person person) {
        personList.remove(person);
    }

    public ObservableList <Person> getPersonList() {
        return personList;
    }

    public void print(){
        int number = 0;
        System.out.println();
        for(Person person : personList){
            number++;
            System.out.println(number+") fio = "+person.getFio()+"; phone = "+person.getPhone());
        }
    }

    public void fillTestData(){
        personList.add(new Person("Верламов Михаил", "0631264154"));
        personList.add(new Person("Роман Романов", "345345345"));
        personList.add(new Person("Рома Игнатенко", "132160923441"));
    }



}

