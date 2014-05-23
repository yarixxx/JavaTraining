package algo.structures;

import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class TestUrlTree {
    private UrlTree urlTree;
    private URL root;
    private Set<URL> rootChildren = new HashSet<URL>();

    @Test
    public void testAddRootUrl() throws MalformedURLException {
        root = new URL("http://test.com/");
        urlTree = new UrlTree(root);
        assertEquals(root, urlTree.next());
    }

    @Test
    public void testAddNewUrl() throws MalformedURLException {
        root = new URL("http://test.com/");
        URL newUrl = new URL("http://test.com/test");
        urlTree = new UrlTree(root);
        urlTree.next();
        urlTree.addUrl(root, newUrl);
        assertEquals(newUrl, urlTree.next());
    }

    @Test
    public void testAddNewUrl2() throws MalformedURLException {
        root = new URL("http://test.com/");
        URL newUrl1 = new URL("http://test.com/test1");
        URL newUrl2 = new URL("http://test.com/test2");
        rootChildren.add(newUrl1);
        rootChildren.add(newUrl2);
        urlTree = new UrlTree(root);
        urlTree.next();
        urlTree.addUrl(root, newUrl1);
        urlTree.addUrl(root, newUrl2);
        assertEquals(rootChildren, urlTree.getChildren(root));
    }
}
