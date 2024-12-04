class number_pattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = 1;
                for (int k = 0; k <= n; k++) {
                    if (i == k || j == k || i == n - 1 - k || j == n - 1 - k) {
                        value = k + 1;
                        break;
                    }
                }
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
