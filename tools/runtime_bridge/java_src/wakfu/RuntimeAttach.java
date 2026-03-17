package wakfu;

import com.sun.tools.attach.VirtualMachine;

public final class RuntimeAttach {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("Usage: RuntimeAttach <pid> <agent-jar> [agent-args]");
            System.exit(2);
            return;
        }

        String pid = args[0];
        String agentJar = args[1];
        String agentArgs = args.length >= 3 ? args[2] : "";

        VirtualMachine vm = null;
        try {
            vm = VirtualMachine.attach(pid);
            vm.loadAgent(agentJar, agentArgs);
            System.out.println("ATTACHED pid=" + pid);
        } finally {
            if (vm != null) {
                vm.detach();
            }
        }
    }
}
