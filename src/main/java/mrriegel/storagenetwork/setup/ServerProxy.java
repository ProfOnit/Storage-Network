package mrriegel.storagenetwork.setup;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class ServerProxy implements IProxy {
	@Override
	public World getClientWorld() {
		 throw new IllegalStateException("Client side only code on the server");
	}

	@Override
	public PlayerEntity getClientPlayer() {
		throw new IllegalStateException("Only run this on the client!");
	}
}
