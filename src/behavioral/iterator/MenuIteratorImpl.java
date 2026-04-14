package behavioral.iterator;
import java.util.List;

public class MenuIteratorImpl implements MenuIterator {
    private List<String> items;
    private int position = 0;

    public MenuIteratorImpl(List<String> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public String next() {
        if (this.hasNext()) {
            return items.get(position++);
        }
        return null;
    }
}