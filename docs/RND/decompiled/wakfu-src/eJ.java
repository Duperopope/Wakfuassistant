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

public final class eJ
extends GeneratedMessageV3
implements eM {
    private static final long nC = 0L;
    int an;
    public static final int nD = 1;
    int nE;
    public static final int nF = 2;
    List<eF> nG;
    public static final int nH = 4;
    int nI;
    private byte Y = (byte)-1;
    private static final eJ nJ = new eJ();
    @Deprecated
    public static final Parser<eJ> nK = new eK();

    eJ(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private eJ() {
        this.nG = Collections.emptyList();
        this.nI = -2;
    }

    protected Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
        return new eJ();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    eJ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block13: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block13;
                    }
                    case 8: {
                        this.an |= 1;
                        this.nE = codedInputStream.readInt32();
                        continue block13;
                    }
                    case 18: {
                        if ((n & 2) == 0) {
                            this.nG = new ArrayList<eF>();
                            n |= 2;
                        }
                        this.nG.add((eF)codedInputStream.readMessage(eF.nB, extensionRegistryLite));
                        continue block13;
                    }
                    case 32: {
                        this.an |= 2;
                        this.nI = codedInputStream.readInt32();
                        continue block13;
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
                this.nG = Collections.unmodifiableList(this.nG);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor wK() {
        return eE.nn;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eE.no.ensureFieldAccessorsInitialized(eJ.class, eL.class);
    }

    @Override
    public boolean wL() {
        return (this.an & 1) != 0;
    }

    @Override
    public int wM() {
        return this.nE;
    }

    @Override
    public List<eF> wN() {
        return this.nG;
    }

    @Override
    public List<? extends eI> wO() {
        return this.nG;
    }

    @Override
    public int wP() {
        return this.nG.size();
    }

    @Override
    public eF by(int n) {
        return this.nG.get(n);
    }

    @Override
    public eI bz(int n) {
        return this.nG.get(n);
    }

    @Override
    public boolean wQ() {
        return (this.an & 2) != 0;
    }

    @Override
    public int wR() {
        return this.nI;
    }

    public final boolean isInitialized() {
        byte by = this.Y;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.wL()) {
            this.Y = 0;
            return false;
        }
        for (int i = 0; i < this.wP(); ++i) {
            if (this.by(i).isInitialized()) continue;
            this.Y = 0;
            return false;
        }
        this.Y = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.an & 1) != 0) {
            codedOutputStream.writeInt32(1, this.nE);
        }
        for (int i = 0; i < this.nG.size(); ++i) {
            codedOutputStream.writeMessage(2, (MessageLite)this.nG.get(i));
        }
        if ((this.an & 2) != 0) {
            codedOutputStream.writeInt32(4, this.nI);
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
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.nE);
        }
        for (int i = 0; i < this.nG.size(); ++i) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)((MessageLite)this.nG.get(i)));
        }
        if ((this.an & 2) != 0) {
            n += CodedOutputStream.computeInt32Size((int)4, (int)this.nI);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof eJ)) {
            return super.equals(object);
        }
        eJ eJ2 = (eJ)object;
        if (this.wL() != eJ2.wL()) {
            return false;
        }
        if (this.wL() && this.wM() != eJ2.wM()) {
            return false;
        }
        if (!this.wN().equals(eJ2.wN())) {
            return false;
        }
        if (this.wQ() != eJ2.wQ()) {
            return false;
        }
        if (this.wQ() && this.wR() != eJ2.wR()) {
            return false;
        }
        return this.unknownFields.equals((Object)eJ2.unknownFields);
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + eJ.wK().hashCode();
        if (this.wL()) {
            n = 37 * n + 1;
            n = 53 * n + this.wM();
        }
        if (this.wP() > 0) {
            n = 37 * n + 2;
            n = 53 * n + this.wN().hashCode();
        }
        if (this.wQ()) {
            n = 37 * n + 4;
            n = 53 * n + this.wR();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static eJ an(ByteBuffer byteBuffer) {
        return (eJ)nK.parseFrom(byteBuffer);
    }

    public static eJ an(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (eJ)nK.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static eJ aZ(ByteString byteString) {
        return (eJ)nK.parseFrom(byteString);
    }

    public static eJ an(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (eJ)nK.parseFrom(byteString, extensionRegistryLite);
    }

    public static eJ an(byte[] byArray) {
        return (eJ)nK.parseFrom(byArray);
    }

    public static eJ an(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (eJ)nK.parseFrom(byArray, extensionRegistryLite);
    }

    public static eJ bA(InputStream inputStream) {
        return (eJ)GeneratedMessageV3.parseWithIOException(nK, (InputStream)inputStream);
    }

    public static eJ bA(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eJ)GeneratedMessageV3.parseWithIOException(nK, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eJ bB(InputStream inputStream) {
        return (eJ)GeneratedMessageV3.parseDelimitedWithIOException(nK, (InputStream)inputStream);
    }

    public static eJ bB(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eJ)GeneratedMessageV3.parseDelimitedWithIOException(nK, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static eJ an(CodedInputStream codedInputStream) {
        return (eJ)GeneratedMessageV3.parseWithIOException(nK, (CodedInputStream)codedInputStream);
    }

    public static eJ cN(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (eJ)GeneratedMessageV3.parseWithIOException(nK, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public eL wS() {
        return eJ.wT();
    }

    public static eL wT() {
        return nJ.wU();
    }

    public static eL a(eJ eJ2) {
        return nJ.wU().c(eJ2);
    }

    public eL wU() {
        return this == nJ ? new eL() : new eL().c(this);
    }

    protected eL an(GeneratedMessageV3.BuilderParent builderParent) {
        eL eL2 = new eL(builderParent);
        return eL2;
    }

    public static eJ wV() {
        return nJ;
    }

    public static Parser<eJ> z() {
        return nK;
    }

    public Parser<eJ> getParserForType() {
        return nK;
    }

    public eJ wW() {
        return nJ;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.an(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.wU();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.wS();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.wU();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.wS();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.wW();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.wW();
    }

    static /* synthetic */ boolean aJ() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ boolean oB() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(eJ eJ2) {
        return eJ2.unknownFields;
    }
}

