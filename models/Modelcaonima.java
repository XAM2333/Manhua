// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcaonima extends EntityModel<Entity> {
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer _r1;
	private final ModelRenderer _r2;
	private final ModelRenderer _r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;

	public Modelcaonima() {
		textureWidth = 32;
		textureHeight = 32;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		setRotationAngle(bone, 0.0F, 3.1416F, 0.0F);
		bone.setTextureOffset(0, 21).addBox(-1.0F, -1.0F, 1.75F, 1.0F, 1.0F, 0.5F, 0.0F, false);
		bone.setTextureOffset(12, 0).addBox(-1.0F, -3.0F, 1.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(6, 0).addBox(-1.0F, -3.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(4, 21).addBox(-1.0F, -1.0F, -0.25F, 1.0F, 1.0F, 0.5F, 0.0F, false);
		bone.setTextureOffset(5, 5).addBox(-1.0F, -3.0F, -7.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -3.0F, -5.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		bone.setTextureOffset(8, 21).addBox(-1.0F, -1.0F, -5.25F, 1.0F, 1.0F, 0.5F, 0.0F, false);
		bone.setTextureOffset(0, 23).addBox(-1.0F, -1.0F, -7.25F, 1.0F, 1.0F, 0.5F, 0.0F, false);
		bone.setTextureOffset(0, 0).addBox(-1.0F, -7.0F, -7.5F, 1.0F, 4.0F, 10.0F, 0.0F, false);
		bone.setTextureOffset(12, 0).addBox(-1.0F, -8.0F, -6.5F, 1.0F, 1.0F, 9.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, -1.6307F, 0.0F, 0.0F);
		cube_r1.setTextureOffset(23, 2).addBox(-1.0F, -4.7F, -9.95F, 1.0F, 0.25F, 0.559F, 0.0F, false);
		cube_r1.setTextureOffset(23, 0).addBox(-1.0F, -6.49F, -9.05F, 1.0F, 0.25F, 0.559F, 0.0F, false);

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -10.0F, 4.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.5835F, 0.0F, 0.0F);
		cube_r2.setTextureOffset(28, 0).addBox(-1.0F, 2.35F, 1.0F, 1.0F, 0.25F, 0.559F, 0.0F, false);
		cube_r2.setTextureOffset(27, 2).addBox(-1.0F, 0.55F, 0.1F, 1.0F, 0.25F, 0.559F, 0.0F, false);

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.5236F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(28, 5).addBox(-1.0F, -10.5F, -1.0F, 1.0F, 0.5F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(29, 4).addBox(-1.0F, -11.0F, -0.75F, 1.0F, 0.5F, 0.5F, 0.0F, false);
		cube_r3.setTextureOffset(23, 4).addBox(-1.0F, -11.0F, 1.25F, 1.0F, 0.5F, 0.5F, 0.0F, false);
		cube_r3.setTextureOffset(23, 6).addBox(-1.0F, -10.5F, 1.0F, 1.0F, 0.5F, 1.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 0).addBox(-1.0F, -7.0F, -2.0F, 1.0F, 1.0F, 4.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 5).addBox(-1.0F, -10.0F, -1.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
		cube_r3.setTextureOffset(0, 14).addBox(-1.0F, -9.0F, -2.0F, 1.0F, 2.0F, 5.0F, 0.0F, false);

		_r1 = new ModelRenderer(this);
		_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(_r1);
		setRotationAngle(_r1, -1.309F, 0.0F, 0.0F);
		_r1.setTextureOffset(28, 10).addBox(-1.0F, -6.3642F, -7.8F, 1.0F, 1.4142F, 0.75F, 0.0F, false);
		_r1.setTextureOffset(22, 13).addBox(-1.0F, -7.0642F, -3.58F, 1.0F, 1.4142F, 0.75F, 0.0F, false);

		_r2 = new ModelRenderer(this);
		_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(_r2);
		setRotationAngle(_r2, 0.2618F, 0.0F, 0.0F);
		_r2.setTextureOffset(22, 10).addBox(-1.0F, -5.6642F, 7.76F, 1.0F, 1.4142F, 0.75F, 0.0F, false);

		_r3 = new ModelRenderer(this);
		_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(_r3);
		setRotationAngle(_r3, -0.7854F, 0.0F, 0.0F);
		_r3.setTextureOffset(28, 13).addBox(-1.0F, -1.0642F, -10.25F, 1.0F, 1.4142F, 1.0F, 0.0F, false);

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.5F, -1.25F, -7.4949F);
		bone.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.245F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(29, 25).addBox(-0.5F, 0.2393F, -0.0651F, 1.0F, 1.0307F, 0.5F, 0.0F, false);

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.5F, -1.25F, -7.4949F);
		bone.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.245F, 0.0F, 0.0F);
		cube_r5.setTextureOffset(29, 21).addBox(-0.5F, -0.0107F, 0.5249F, 1.0F, 1.0307F, 0.5F, 0.0F, false);

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.5F, -1.25F, -5.4949F);
		bone.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.245F, 0.0F, 0.0F);
		cube_r6.setTextureOffset(22, 19).addBox(-0.5F, -0.0107F, 0.5249F, 1.0F, 1.0307F, 0.5F, 0.0F, false);

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(-0.5F, -1.25F, -5.4949F);
		bone.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.245F, 0.0F, 0.0F);
		cube_r7.setTextureOffset(28, 23).addBox(-0.5F, 0.2393F, -0.0651F, 1.0F, 1.0307F, 0.5F, 0.0F, false);

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-0.5F, -1.25F, -0.4949F);
		bone.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.245F, 0.0F, 0.0F);
		cube_r8.setTextureOffset(28, 18).addBox(-0.5F, 0.2393F, -0.0651F, 1.0F, 1.0307F, 0.5F, 0.0F, false);

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-0.5F, -1.25F, -0.4949F);
		bone.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.245F, 0.0F, 0.0F);
		cube_r9.setTextureOffset(22, 23).addBox(-0.5F, -0.0107F, 0.5249F, 1.0F, 1.0307F, 0.5F, 0.0F, false);

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.5F, -1.25F, 1.5051F);
		bone.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.245F, 0.0F, 0.0F);
		cube_r10.setTextureOffset(29, 16).addBox(-0.5F, 0.2393F, -0.0651F, 1.0F, 1.0307F, 0.5F, 0.0F, false);

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(-0.5F, -1.25F, 1.5051F);
		bone.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.245F, 0.0F, 0.0F);
		cube_r11.setTextureOffset(22, 16).addBox(-0.5F, -0.0107F, 0.5249F, 1.0F, 1.0307F, 0.5F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
	}
}