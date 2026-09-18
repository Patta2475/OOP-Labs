    package lab1.Q4and5;

    public class AccountList {
        private Account[] accounts;
        private int count;

        public AccountList(int amount){
            accounts = new Account[amount];
            count = 0;
        }

        public boolean appendAccount(Account account){
            if (count >= this.accounts.length){
                return false;
            }
            this.accounts[count] = account;
            count++;
            return true;
        }

        public Account getAccount(int idx){
            if (idx + 1 <= count){
                return accounts[idx];
            } else {
                System.out.println("Input index exceeds the number of appended elements");
                return null;
            }
        }
    }
