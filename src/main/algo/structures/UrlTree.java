package algo.structures;

import java.net.URL;
import java.util.*;

public class UrlTree {
    public UrlTree(URL start) {
        this.root = new UrlItem(start);
        todo.put(start, this.root);
    }

    private UrlItem root;
    private Map<URL, UrlItem> todo = new HashMap<URL, UrlItem>();
    private Map<URL, UrlItem> tree = new HashMap<URL, UrlItem>();

    public URL next() {
        Map.Entry<URL, UrlItem> urlItem = todo.entrySet().iterator().next();
        todo.remove(urlItem.getKey());
        tree.put(urlItem.getKey(), urlItem.getValue());
        return urlItem.getKey();
    }

    public void addUrl(URL url, URL child) {
        UrlItem todoItem = todo.get(child);
        UrlItem treeItem = tree.get(child);
        UrlItem childItem;
        if (todoItem == null && treeItem == null) {
            childItem = new UrlItem(child);
            todo.put(child, childItem);
        } else {
            childItem = todoItem == null ? treeItem : todoItem;
        }
        tree.get(url).children.add(childItem);
    }

    public Set<URL> getChildren(URL url) {
        Set<URL> results = new HashSet<URL>();
        for (UrlItem urlItem : tree.get(url).children) {
            results.add(urlItem.url);
        }
        return results;
    }

    private class UrlItem {
        UrlItem (URL url) {
            this.url = url;
        }
        private URL url;
        private Set<UrlItem> children = new HashSet<UrlItem>();
    }
}
