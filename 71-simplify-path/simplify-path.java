class Solution {
    public String simplifyPath(String path) {
        String[] parts = path.split("/");
        Stack<String> stack = new Stack<>();

        for (String p : parts) {
            if (p.equals("") || p.equals(".")) {
                continue; 
            } else if (p.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop(); 
                }
            } else {
                stack.push(p); 
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String dir : stack) {
            sb.append("/").append(dir);
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }
}
