package proxyStatic;

public class Client {
    public static void main(String[] args) {
        CLocalPicShow cls = new CLocalPicShow();
        cls.ShowPic("photo1.pic");
        IShowPic ipic = new CRemoPic();
        IShowPic proxy = (IShowPic) new CLocalPicShow();
        proxy  .ShowPic("photo2.pic");
    }
}
