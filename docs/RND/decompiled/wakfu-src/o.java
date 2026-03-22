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

public final class o
extends GeneratedMessageV3
implements r_0 {
    private static final long ai = 0L;
    public static final int aj = 1;
    List<h> ak;
    private byte Y = (byte)-1;
    private static final o al = new o();
    static final Parser<o> am = new p();

    o(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private o() {
        this.ak = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new o();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    o(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.ak = new ArrayList<h>();
                            bl |= true;
                        }
                        this.ak.add((h)codedInputStream.readMessage(h.z(), extensionRegistryLite));
                        continue block11;
                    }
                }
                if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue;
                bl2 = true;
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
            if (bl & true) {
                this.ak = Collections.unmodifiableList(this.ak);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor ah() {
        return g_0.K;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return g_0.L.ensureFieldAccessorsInitialized(o.class, q.class);
    }

    @Override
    public List<h> ai() {
        return this.ak;
    }

    @Override
    public List<? extends s_0> aj() {
        return this.ak;
    }

    @Override
    public int ak() {
        return this.ak.size();
    }

    @Override
    public h a(int n) {
        return this.ak.get(n);
    }

    @Override
    public s_0 b(int n) {
        return this.ak.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.ak.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.ak.get(i));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.ak.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.ak.get(i)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof o)) {
            return super.equals(object);
        }
        o o2 = (o)object;
        if (!this.ai().equals(o2.ai())) {
            return false;
        }
        return this.unknownFields.equals((Object)o2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + o.ah().hashCode();
        if (this.ak() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.ai().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static o c(ByteBuffer byteBuffer) {
        return (o)am.parseFrom(byteBuffer);
    }

    public static o c(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (o)am.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static o i(ByteString byteString) {
        return (o)am.parseFrom(byteString);
    }

    public static o c(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (o)am.parseFrom(byteString, extensionRegistryLite);
    }

    public static o c(byte[] byArray) {
        return (o)am.parseFrom(byArray);
    }

    public static o c(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (o)am.parseFrom(byArray, extensionRegistryLite);
    }

    public static o e(InputStream inputStream) {
        return (o)GeneratedMessageV3.parseWithIOException(am, (InputStream)inputStream);
    }

    public static o e(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (o)GeneratedMessageV3.parseWithIOException(am, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static o f(InputStream inputStream) {
        return (o)GeneratedMessageV3.parseDelimitedWithIOException(am, (InputStream)inputStream);
    }

    public static o f(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (o)GeneratedMessageV3.parseDelimitedWithIOException(am, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static o c(CodedInputStream codedInputStream) {
        return (o)GeneratedMessageV3.parseWithIOException(am, (CodedInputStream)codedInputStream);
    }

    public static o g(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (o)GeneratedMessageV3.parseWithIOException(am, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public q al() {
        return o.am();
    }

    public static q am() {
        return al.an();
    }

    public static q a(o o2) {
        return al.an().c(o2);
    }

    public q an() {
        return this == al ? new q() : new q().c(this);
    }

    protected q c(GeneratedMessageV3.BuilderParent builderParent) {
        q q2 = new q(builderParent);
        return q2;
    }

    public static o ao() {
        return al;
    }

    public static Parser<o> z() {
        return am;
    }

    public Parser<o> getParserForType() {
        return am;
    }

    public o ap() {
        return al;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.c(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.an();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.al();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.an();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.al();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ap();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ap();
    }

    static /* synthetic */ boolean aq() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean ar() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(o o2) {
        return o2.unknownFields;
    }
}

