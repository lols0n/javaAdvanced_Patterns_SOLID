package com.company.solid.lsp;

public class File implements FileOperation {

    @Override
    public byte[] read() {
        return new byte[0];
    }

    @Override
    public void write(byte[] data) {
        System.out.println("writing " + data);
    }
}
