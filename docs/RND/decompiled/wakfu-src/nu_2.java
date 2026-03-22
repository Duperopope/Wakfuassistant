/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MapField
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;
import java.util.Map;

/*
 * Renamed from nU
 */
public final class nu_2
extends GeneratedMessageV3.Builder<nu_2>
implements nw_2 {
    private int an;
    private MapField<String, String> Py;

    public static final Descriptors.Descriptor atj() {
        return nj_2.Pg;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.ata();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 1: {
                return this.ato();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nj_2.Ph.ensureFieldAccessorsInitialized(ns_2.class, nu_2.class);
    }

    nu_2() {
        this.D();
    }

    nu_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.D();
    }

    private void D() {
        if (ns_2.aJ()) {
            // empty if block
        }
    }

    public nu_2 atk() {
        super.clear();
        this.ato().clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return nj_2.Pg;
    }

    public ns_2 ati() {
        return ns_2.ath();
    }

    public ns_2 atl() {
        ns_2 ns_22 = this.atm();
        if (!ns_22.isInitialized()) {
            throw nu_2.newUninitializedMessageException((Message)ns_22);
        }
        return ns_22;
    }

    public ns_2 atm() {
        ns_2 ns_22 = new ns_2(this);
        int n = this.an;
        ns_22.Py = this.ata();
        ns_22.Py.makeImmutable();
        this.onBuilt();
        return ns_22;
    }

    public nu_2 atn() {
        return (nu_2)super.clone();
    }

    public nu_2 fw(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nu_2)super.setField(fieldDescriptor, object);
    }

    public nu_2 cl(Descriptors.FieldDescriptor fieldDescriptor) {
        return (nu_2)super.clearField(fieldDescriptor);
    }

    public nu_2 cl(Descriptors.OneofDescriptor oneofDescriptor) {
        return (nu_2)super.clearOneof(oneofDescriptor);
    }

    public nu_2 cl(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (nu_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public nu_2 fx(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nu_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public nu_2 cl(Message message) {
        if (message instanceof ns_2) {
            return this.c((ns_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public nu_2 c(ns_2 ns_22) {
        if (ns_22 == ns_2.ath()) {
            return this;
        }
        this.ato().mergeFrom(ns_22.ata());
        this.fx(ns_2.b(ns_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public nu_2 iJ(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ns_2 ns_22 = null;
        try {
            ns_22 = (ns_2)ns_2.PA.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ns_22 = (ns_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ns_22 != null) {
                this.c(ns_22);
            }
        }
        return this;
    }

    private MapField<String, String> ata() {
        if (this.Py == null) {
            return MapField.emptyMapField(nv_2.PB);
        }
        return this.Py;
    }

    private MapField<String, String> ato() {
        this.onChanged();
        if (this.Py == null) {
            this.Py = MapField.newMapField(nv_2.PB);
        }
        if (!this.Py.isMutable()) {
            this.Py = this.Py.copy();
        }
        return this.Py;
    }

    @Override
    public int atb() {
        return this.ata().getMap().size();
    }

    @Override
    public boolean ai(String string) {
        if (string == null) {
            throw new NullPointerException("map key");
        }
        return this.ata().getMap().containsKey(string);
    }

    @Override
    @Deprecated
    public Map<String, String> atc() {
        return this.atd();
    }

    @Override
    public Map<String, String> atd() {
        return this.ata().getMap();
    }

    @Override
    public String c(String string, String string2) {
        if (string == null) {
            throw new NullPointerException("map key");
        }
        Map map = this.ata().getMap();
        return map.containsKey(string) ? (String)map.get(string) : string2;
    }

    @Override
    public String aj(String string) {
        if (string == null) {
            throw new NullPointerException("map key");
        }
        Map map = this.ata().getMap();
        if (!map.containsKey(string)) {
            throw new IllegalArgumentException();
        }
        return (String)map.get(string);
    }

    public nu_2 atp() {
        this.ato().getMutableMap().clear();
        return this;
    }

    public nu_2 ak(String string) {
        if (string == null) {
            throw new NullPointerException("map key");
        }
        this.ato().getMutableMap().remove(string);
        return this;
    }

    @Deprecated
    public Map<String, String> atq() {
        return this.ato().getMutableMap();
    }

    public nu_2 d(String string, String string2) {
        if (string == null) {
            throw new NullPointerException("map key");
        }
        if (string2 == null) {
            throw new NullPointerException("map value");
        }
        this.ato().getMutableMap().put(string, string2);
        return this;
    }

    public nu_2 p(Map<String, String> map) {
        this.ato().getMutableMap().putAll(map);
        return this;
    }

    public final nu_2 fw(UnknownFieldSet unknownFieldSet) {
        return (nu_2)super.setUnknownFields(unknownFieldSet);
    }

    public final nu_2 fx(UnknownFieldSet unknownFieldSet) {
        return (nu_2)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fx(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fw(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fx(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cl(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cl(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cl(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fw(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.atk();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.atn();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fx(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iJ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.cl(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.atk();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cl(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.atn();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fx(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.fw(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fx(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.cl(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.cl(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.cl(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.fw(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iJ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.atn();
    }

    public /* synthetic */ Message buildPartial() {
        return this.atm();
    }

    public /* synthetic */ Message build() {
        return this.atl();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.cl(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.atk();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iJ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.atn();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.atm();
    }

    public /* synthetic */ MessageLite build() {
        return this.atl();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.atk();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ati();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ati();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.iJ(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.atn();
    }

    public /* synthetic */ Object clone() {
        return this.atn();
    }
}

