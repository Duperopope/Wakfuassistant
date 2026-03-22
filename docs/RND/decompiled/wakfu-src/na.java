/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.GeneratedMessageV3$UnusedPrivateParameter
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UninitializedMessageException
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class na
extends GeneratedMessageV3
implements nd {
    private static final long MU = 0L;
    int an;
    public static final int MV = 1;
    mk Kp;
    public static final int MW = 2;
    List<mw_1> Ce;
    private byte Y = (byte)-1;
    private static final na MX = new na();
    @Deprecated
    public static final Parser<na> MY = new nb();

    na(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private na() {
        this.Ce = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new na();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    na(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block12: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block12;
                    }
                    case 10: {
                        mm_0 mm_02 = null;
                        if ((this.an & 1) != 0) {
                            mm_02 = this.Kp.ald();
                        }
                        this.Kp = (mk)codedInputStream.readMessage(mk.KC, extensionRegistryLite);
                        if (mm_02 != null) {
                            mm_02.e(this.Kp);
                            this.Kp = mm_02.alj();
                        }
                        this.an |= 1;
                        continue block12;
                    }
                    case 18: {
                        if ((n & 2) == 0) {
                            this.Ce = new ArrayList<mw_1>();
                            n |= 2;
                        }
                        this.Ce.add((mw_1)codedInputStream.readMessage(mw_1.MT, extensionRegistryLite));
                        continue block12;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue;
                bl = true;
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (UninitializedMessageException uninitializedMessageException) {
            throw uninitializedMessageException.asInvalidProtocolBufferException().setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if ((n & 2) != 0) {
                this.Ce = Collections.unmodifiableList(this.Ce);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor apa() {
        return mv_0.MG;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mv_0.MH.ensureFieldAccessorsInitialized(na.class, nc.class);
    }

    @Override
    public boolean akD() {
        return (this.an & 1) != 0;
    }

    @Override
    public mk akE() {
        return this.Kp == null ? mk.ale() : this.Kp;
    }

    @Override
    public mn akF() {
        return this.Kp == null ? mk.ale() : this.Kp;
    }

    @Override
    public List<mw_1> Ve() {
        return this.Ce;
    }

    @Override
    public List<? extends mZ> Vf() {
        return this.Ce;
    }

    @Override
    public int Vg() {
        return this.Ce.size();
    }

    @Override
    public mw_1 iL(int n) {
        return this.Ce.get(n);
    }

    @Override
    public mZ iM(int n) {
        return this.Ce.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.akD()) {
            this.Y = 0;
            return false;
        }
        if (!this.akE().isInitialized()) {
            this.Y = 0;
            return false;
        }
        for (int i = 0; i < this.Vg(); ++i) {
            if (this.iL(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeMessage(1, (MessageLite)this.akE());
        }
        for (int i = 0; i < this.Ce.size(); ++i) {
            codedOutputStream.writeMessage(2, (MessageLite)this.Ce.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.an & 1) != 0) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)this.akE());
        }
        for (int i = 0; i < this.Ce.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.Ce.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof na)) {
            return super.equals(object);
        }
        na na2 = (na)object;
        if (this.akD() != na2.akD()) {
            return false;
        }
        if (this.akD() && !this.akE().equals(na2.akE())) {
            return false;
        }
        if (!this.Ve().equals(na2.Ve())) {
            return false;
        }
        return this.unknownFields.equals((Object)na2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + na.apa().hashCode();
        if (this.akD()) {
            n = 37 * n + 1;
            n = 53 * n + this.akE().hashCode();
        }
        if (this.Vg() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.Ve().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static na ci(ByteBuffer byteBuffer) {
        return (na)MY.parseFrom(byteBuffer);
    }

    public static na ce(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (na)MY.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static na dt(ByteString byteString) {
        return (na)MY.parseFrom(byteString);
    }

    public static na ce(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (na)MY.parseFrom(byteString, extensionRegistryLite);
    }

    public static na cf(byte[] byArray) {
        return (na)MY.parseFrom(byArray);
    }

    public static na ce(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (na)MY.parseFrom(byArray, extensionRegistryLite);
    }

    public static na fi(InputStream inputStream) {
        return (na)GeneratedMessageV3.parseWithIOException(MY, (InputStream)inputStream);
    }

    public static na fi(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (na)GeneratedMessageV3.parseWithIOException(MY, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static na fj(InputStream inputStream) {
        return (na)GeneratedMessageV3.parseDelimitedWithIOException(MY, (InputStream)inputStream);
    }

    public static na fj(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (na)GeneratedMessageV3.parseDelimitedWithIOException(MY, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static na ce(CodedInputStream codedInputStream) {
        return (na)GeneratedMessageV3.parseWithIOException(MY, (CodedInputStream)codedInputStream);
    }

    public static na im(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (na)GeneratedMessageV3.parseWithIOException(MY, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public nc apb() {
        return na.apc();
    }

    public static nc apc() {
        return MX.apd();
    }

    public static nc a(na na2) {
        return MX.apd().c(na2);
    }

    public nc apd() {
        return this == MX ? new nc() : new nc().c(this);
    }

    protected nc ce(GeneratedMessageV3.BuilderParent builderParent) {
        nc nc2 = new nc(builderParent);
        return nc2;
    }

    public static na ape() {
        return MX;
    }

    public static Parser<na> z() {
        return MY;
    }

    public Parser<na> getParserForType() {
        return MY;
    }

    public na apf() {
        return MX;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.ce(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.apd();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.apb();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.apd();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.apb();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.apf();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.apf();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oB() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(na na2) {
        return na2.unknownFields;
    }
}

