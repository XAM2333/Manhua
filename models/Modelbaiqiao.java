// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelbaiqiao extends EntityModel<Entity> {
	private final ModelRenderer bb_main;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;

	public Modelbaiqiao() {
		textureWidth = 32;
		textureHeight = 32;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(6, 0).addBox(-0.5F, -13.0F, -6.0F, 1.0F, 7.5F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 0).addBox(-0.5F, -6.0F, -6.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 2).addBox(-2.0F, -14.0F, -6.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(0, 11).addBox(-3.0F, -18.0F, -6.0F, 6.0F, 4.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 0).addBox(-2.0F, -19.0F, -6.0F, 4.0F, 1.0F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(16, 4).addBox(0.75F, -21.7F, -6.0F, 1.0F, 2.7F, 1.0F, 0.0F, false);
		bb_main.setTextureOffset(12, 4).addBox(-1.75F, -21.7F, -6.0F, 1.0F, 2.7F, 1.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(3.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -0.1745F);
		cube_r1.setTextureOffset(17, 17).addBox(1.5F, -21.5F, -6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(3.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.1745F);
		cube_r2.setTextureOffset(12, 18).addBox(-6.0F, -20.85F, -6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.1745F);
		cube_r3.setTextureOffset(18, 11).addBox(2.0F, -21.4F, -6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.1745F);
		cube_r4.setTextureOffset(20, 4).addBox(-5.5F, -21.0F, -6.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.setTextureOffset(25, 0).addBox(7.8F, -12.0142F, -6.0F, 1.0F, 1.4142F, 1.0F, 0.0F, false);
		cube_r5.setTextureOffset(25, 20).addBox(13.85F, -12.0142F, -6.0F, 1.0F, 1.4142F, 1.0F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, 0.7854F);
		cube_r6.setTextureOffset(24, 10).addBox(-8.8F, -12.0142F, -6.0F, 1.0F, 1.4142F, 1.0F, 0.0F, false);
		cube_r6.setTextureOffset(25, 16).addBox(-14.85F, -12.0142F, -6.0F, 1.0F, 1.4142F, 1.0F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r7);
		setRotationAngle(cube_r7, -0.2345F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(25, 6).addBox(-0.5F, -11.818F, 4.37F, 1.0F, 1.118F, 1.0F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r8);
		setRotationAngle(cube_r8, -1.1618F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(25, 3).addBox(-0.5F, -10.968F, -7.16F, 1.0F, 1.118F, 1.0F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.6981F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(21, 1).addBox(-0.5F, -13.0F, -1.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		cube_r9.setTextureOffset(0, 0).addBox(-0.5F, -12.0F, -2.0F, 1.0F, 6.0F, 2.0F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(0.0F, 0.0F, 7.0F);
		bb_main.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, -0.48F);
		cube_r10.setTextureOffset(4, 16).addBox(2.0F, -5.0F, -4.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r10.setTextureOffset(8, 16).addBox(2.0F, -5.0F, -13.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.0F, 0.0F, 7.0F);
		bb_main.addChild(cube_r11);
		setRotationAngle(cube_r11, 0.0F, 0.0F, 0.48F);
		cube_r11.setTextureOffset(14, 11).addBox(-3.0F, -5.0F, -4.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
		cube_r11.setTextureOffset(0, 16).addBox(-3.0F, -5.0F, -13.0F, 1.0F, 6.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}