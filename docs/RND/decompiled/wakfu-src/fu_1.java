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
 *  com.google.protobuf.MapEntry
 *  com.google.protobuf.MapField
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
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
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
import java.util.Map;

/*
 * Renamed from fU
 */
public final class fu_1
extends GeneratedMessageV3
implements fy_2 {
    private static final long rq = 0L;
    public static final int rr = 1;
    List<fp_1> rs;
    public static final int rt = 2;
    MapField<Long, Integer> ru;
    private byte Y = (byte)-1;
    private static final fu_1 rv = new fu_1();
    @Deprecated
    public static final Parser<fu_1> rw = new fv_1();

    fu_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private fu_1() {
        this.rs = Collections.emptyList();
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new fu_1();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    fu_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        if (!(n & true)) {
                            this.rs = new ArrayList<fp_1>();
                            n |= 1;
                        }
                        this.rs.add((fp_1)codedInputStream.readMessage(fp_1.ro, extensionRegistryLite));
                        continue block12;
                    }
                    case 18: {
                        if ((n & 2) == 0) {
                            this.ru = MapField.newMapField(fw_2.rx);
                            n |= 2;
                        }
                        MapEntry mapEntry = (MapEntry)codedInputStream.readMessage(fw_2.rx.getParserForType(), extensionRegistryLite);
                        this.ru.getMutableMap().put((Long)mapEntry.getKey(), (Integer)mapEntry.getValue());
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
            if (n & true) {
                this.rs = Collections.unmodifiableList(this.rs);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor Cp() {
        return fo_1.qS;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 2: {
                return this.Ct();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fo_1.qT.ensureFieldAccessorsInitialized(fu_1.class, fx_2.class);
    }

    @Override
    public List<fp_1> Cq() {
        return this.rs;
    }

    @Override
    public List<? extends ft_1> Cr() {
        return this.rs;
    }

    @Override
    public int Cs() {
        return this.rs.size();
    }

    @Override
    public fp_1 cH(int n) {
        return this.rs.get(n);
    }

    @Override
    public ft_1 cI(int n) {
        return this.rs.get(n);
    }

    MapField<Long, Integer> Ct() {
        if (this.ru == null) {
            return MapField.emptyMapField(fw_2.rx);
        }
        return this.ru;
    }

    @Override
    public int Cu() {
        return this.Ct().getMap().size();
    }

    @Override
    public boolean O(long l) {
        return this.Ct().getMap().containsKey(l);
    }

    @Override
    @Deprecated
    public Map<Long, Integer> Cv() {
        return this.Cw();
    }

    @Override
    public Map<Long, Integer> Cw() {
        return this.Ct().getMap();
    }

    @Override
    public int a(long l, int n) {
        Map map = this.Ct().getMap();
        return map.containsKey(l) ? (Integer)map.get(l) : n;
    }

    @Override
    public int P(long l) {
        Map map = this.Ct().getMap();
        if (!map.containsKey(l)) {
            throw new IllegalArgumentException();
        }
        return (Integer)map.get(l);
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (int i = 0; i < this.Cs(); ++i) {
            if (this.cH(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int i = 0; i < this.rs.size(); ++i) {
            codedOutputStream.writeMessage(1, (MessageLite)this.rs.get(i));
        }
        GeneratedMessageV3.serializeLongMapTo((CodedOutputStream)codedOutputStream, this.Ct(), fw_2.rx, (int)2);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int i = 0; i < this.rs.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.rs.get(i)));
        }
        for (Map.Entry entry : this.Ct().getMap().entrySet()) {
            MapEntry mapEntry = fw_2.rx.newBuilderForType().setKey((Object)((Long)entry.getKey())).setValue((Object)((Integer)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)mapEntry);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof fu_1)) {
            return super.equals(object);
        }
        fu_1 fu_12 = (fu_1)object;
        if (!this.Cq().equals(fu_12.Cq())) {
            return false;
        }
        if (!this.Ct().equals(fu_12.Ct())) {
            return false;
        }
        return this.unknownFields.equals((Object)fu_12.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + fu_1.Cp().hashCode();
        if (this.Cs() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.Cq().hashCode();
        }
        if (!this.Ct().getMap().isEmpty()) {
            n = 37 * n + 2;
            n = 53 * n + this.Ct().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static fu_1 aB(ByteBuffer byteBuffer) {
        return (fu_1)rw.parseFrom(byteBuffer);
    }

    public static fu_1 az(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (fu_1)rw.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static fu_1 bs(ByteString byteString) {
        return (fu_1)rw.parseFrom(byteString);
    }

    public static fu_1 az(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (fu_1)rw.parseFrom(byteString, extensionRegistryLite);
    }

    public static fu_1 aA(byte[] byArray) {
        return (fu_1)rw.parseFrom(byArray);
    }

    public static fu_1 az(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (fu_1)rw.parseFrom(byArray, extensionRegistryLite);
    }

    public static fu_1 bY(InputStream inputStream) {
        return (fu_1)GeneratedMessageV3.parseWithIOException(rw, (InputStream)inputStream);
    }

    public static fu_1 bY(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fu_1)GeneratedMessageV3.parseWithIOException(rw, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fu_1 bZ(InputStream inputStream) {
        return (fu_1)GeneratedMessageV3.parseDelimitedWithIOException(rw, (InputStream)inputStream);
    }

    public static fu_1 bZ(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fu_1)GeneratedMessageV3.parseDelimitedWithIOException(rw, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static fu_1 az(CodedInputStream codedInputStream) {
        return (fu_1)GeneratedMessageV3.parseWithIOException(rw, (CodedInputStream)codedInputStream);
    }

    public static fu_1 dx(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (fu_1)GeneratedMessageV3.parseWithIOException(rw, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public fx_2 Cx() {
        return fu_1.Cy();
    }

    public static fx_2 Cy() {
        return rv.Cz();
    }

    public static fx_2 a(fu_1 fu_12) {
        return rv.Cz().c(fu_12);
    }

    public fx_2 Cz() {
        return this == rv ? new fx_2() : new fx_2().c(this);
    }

    protected fx_2 az(GeneratedMessageV3.BuilderParent builderParent) {
        fx_2 fx_22 = new fx_2(builderParent);
        return fx_22;
    }

    public static fu_1 CA() {
        return rv;
    }

    public static Parser<fu_1> z() {
        return rw;
    }

    public Parser<fu_1> getParserForType() {
        return rw;
    }

    public fu_1 CB() {
        return rv;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.az(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.Cz();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.Cx();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.Cz();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.Cx();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.CB();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.CB();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oB() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(fu_1 fu_12) {
        return fu_12.unknownFields;
    }
}

