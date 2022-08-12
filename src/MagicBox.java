import java.util.Random;

public class MagicBox<T> {
    protected T item;
    protected T[] items;

    public MagicBox(int size) {

        items = (T[]) new Object[size];
    }

    public int getSizeBox() {

        return items.length;
    }

    public boolean add(T item) {   //метод добавления объекта
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException {
        int еmptyCells = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                еmptyCells++;
            }
        }
        if (еmptyCells > 0) {
            throw new RuntimeException("Коробка не полна! Осталось заполнить " + еmptyCells + " ячеек.");
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(items.length);
            return items[randomInt];
        }
    }
}
