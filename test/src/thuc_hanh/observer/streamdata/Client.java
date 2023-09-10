package thuc_hanh.observer.streamdata;

public abstract class Client<T> implements Stream.Listeners<T> {
    Stream<T> tStream;

    public Client(Stream<T> tStream) {
        this.tStream = tStream;
        tStream.listen(this);
    }
    //    @Override
//    public void handle(T t) {
//
//    }
}
