package com.company.solid.lsp;

public class ReadOnlyFile implements FileOperation {

    @Override
    public byte[] read() {
        return new byte[0];
    }

    //to jest bez sensu bo glownym przebiegiem programu nie powinno byc
    //rzucanie wyjatku (no chyba ze metoda ma wlsasnie do tego sluzyc)
    @Override
    public void write(byte[] data) {
        throw new UnsupportedOperationException();
    }
}
