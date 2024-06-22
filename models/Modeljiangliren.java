// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeljiangliren extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer lefthand_r1;
	private final ModelRenderer righthand_r1;
	private final ModelRenderer head;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer bb_main;
	private final ModelRenderer rightleg_r1;
	private final ModelRenderer leftleg_r1;

	public Modeljiangliren() {
		textureWidth = 32;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-0.5F, 10.4122F, 0.5713F);

		lefthand_r1 = new ModelRenderer(this);
		lefthand_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(lefthand_r1);
		setRotationAngle(lefthand_r1, -0.829F, 0.0F, 0.0F);
		lefthand_r1.setTextureOffset(0, 13).addBox(-0.5F, -3.2122F, -3.5713F, 1.0F, 1.0F, 7.9F, 0.0F, false);

		righthand_r1 = new ModelRenderer(this);
		righthand_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(righthand_r1);
		setRotationAngle(righthand_r1, 0.829F, 0.0F, 0.0F);
		righthand_r1.setTextureOffset(8, 4).addBox(-0.5F, -3.2122F, -4.6713F, 1.0F, 1.0F, 7.9F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(7.5F, -1.5065F, 0.4899F);
		head.setTextureOffset(18, 6).addBox(-8.5F, 2.5065F, -2.4899F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(18, 0).addBox(-8.5F, -3.4935F, -2.4899F, 1.0F, 1.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(0, 0).addBox(-8.5F, -2.4935F, -3.4899F, 1.0F, 5.0F, 7.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.5F, 23.5065F, -0.4899F);
		head.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.7854F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(27, 0).addBox(-9.0F, -13.05F, 16.25F, 1.0F, 1.0F, 1.4142F, 0.0F, false);
		cube_r1.setTextureOffset(27, 12).addBox(-9.0F, -20.5F, 16.25F, 1.0F, 1.0F, 1.4142F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.5F, 23.5065F, -0.4899F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.7854F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(27, 16).addBox(-9.0F, -13.75F, -17.0F, 1.0F, 1.0F, 1.4142F, 0.0F, false);
		cube_r2.setTextureOffset(27, 6).addBox(-9.0F, -21.2F, -17.0F, 1.0F, 1.0F, 1.4142F, 0.0F, false);

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.setTextureOffset(18, 13).addBox(-1.0F, -22.0F, 0.0F, 1.0F, 14.0F, 1.0F, 0.0F, false);

		rightleg_r1 = new ModelRenderer(this);
		rightleg_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(rightleg_r1);
		setRotationAngle(rightleg_r1, -0.3491F, 0.0F, 0.0F);
		rightleg_r1.setTextureOffset(4, 22).addBox(-1.0F, -8.3F, -2.9F, 1.0F, 9.0F, 1.0F, 0.0F, false);

		leftleg_r1 = new ModelRenderer(this);
		leftleg_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bb_main.addChild(leftleg_r1);
		setRotationAngle(leftleg_r1, 0.3491F, 0.0F, 0.0F);
		leftleg_r1.setTextureOffset(0, 22).addBox(-1.0F, -7.95F, 2.9F, 1.0F, 9.0F, 1.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}