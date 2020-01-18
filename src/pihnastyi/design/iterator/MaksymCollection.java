package pihnastyi.design.iterator;

import java.util.List;

public class MaksymCollection implements Collection {
    private String name;
    private List<String> languages;

    public MaksymCollection(String name, List<String> languages) {
        this.name = name;
        this.languages = languages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    @Override
    public Iterator getIterator() {
        return new LanguageIterator();
    }

    class LanguageIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < languages.size();
        }

        @Override
        public Object next() {
            return languages.get(index++);
        }

    }
}
