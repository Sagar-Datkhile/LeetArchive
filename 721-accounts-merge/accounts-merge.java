import java.util.*;

class Solution {

    class DSU {
        Map<String, String> parent;

        public DSU() {
            parent = new HashMap<>();
        }

        public String find(String x) {
            if (!parent.containsKey(x)) {
                parent.put(x, x);
            }
            if (!parent.get(x).equals(x)) {
                parent.put(x, find(parent.get(x))); // path compression
            }
            return parent.get(x);
        }

        public void union(String x, String y) {
            String px = find(x);
            String py = find(y);
            if (!px.equals(py)) {
                parent.put(px, py);
            }
        }
    }

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        DSU dsu = new DSU();
        Map<String, String> emailToName = new HashMap<>();

        for (List<String> account : accounts) {
            String name = account.get(0);
            String firstEmail = account.get(1);

            for (int i = 1; i < account.size(); i++) {
                String email = account.get(i);
                emailToName.put(email, name);
                dsu.union(firstEmail, email);
            }
        }

        Map<String, TreeSet<String>> groups = new HashMap<>();

        for (String email : emailToName.keySet()) {
            String parent = dsu.find(email);
            groups.putIfAbsent(parent, new TreeSet<>());
            groups.get(parent).add(email);
        }

        List<List<String>> result = new ArrayList<>();

        for (String parent : groups.keySet()) {
            List<String> merged = new ArrayList<>();
            merged.add(emailToName.get(parent));
            merged.addAll(groups.get(parent));
            result.add(merged);
        }

        return result;
    }
}